/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: inference._types.ReasoningDetail

/**
 * Type representing the different types of reasoning details that can be
 * included in the response from the model. Currently supported only for
 * <code>elastic</code> provider.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ReasoningDetail">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReasoningDetail implements TaggedUnion<ReasoningDetail.Kind, ReasoningDetailVariant>, JsonpSerializable {

	/**
	 * {@link ReasoningDetail} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#inference._types.ReasoningDetail">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		ReasoningEncrypted("reasoning.encrypted"),

		ReasoningSummary("reasoning.summary"),

		ReasoningText("reasoning.text"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final ReasoningDetailVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final ReasoningDetailVariant _get() {
		return _value;
	}

	public ReasoningDetail(ReasoningDetailVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._reasoningDetailKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private ReasoningDetail(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ReasoningDetail of(Function<Builder, ObjectBuilder<ReasoningDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code reasoning.encrypted}?
	 */
	public boolean isReasoningEncrypted() {
		return _kind == Kind.ReasoningEncrypted;
	}

	/**
	 * Get the {@code reasoning.encrypted} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reasoning.encrypted}
	 *             kind.
	 */
	public EncryptedReasoningDetail reasoningEncrypted() {
		return TaggedUnionUtils.get(this, Kind.ReasoningEncrypted);
	}

	/**
	 * Is this variant instance of kind {@code reasoning.summary}?
	 */
	public boolean isReasoningSummary() {
		return _kind == Kind.ReasoningSummary;
	}

	/**
	 * Get the {@code reasoning.summary} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reasoning.summary}
	 *             kind.
	 */
	public SummaryReasoningDetail reasoningSummary() {
		return TaggedUnionUtils.get(this, Kind.ReasoningSummary);
	}

	/**
	 * Is this variant instance of kind {@code reasoning.text}?
	 */
	public boolean isReasoningText() {
		return _kind == Kind.ReasoningText;
	}

	/**
	 * Get the {@code reasoning.text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reasoning.text} kind.
	 */
	public TextReasoningDetail reasoningText() {
		return TaggedUnionUtils.get(this, Kind.ReasoningText);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ReasoningDetail> {
		private Kind _kind;
		private ReasoningDetailVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<ReasoningDetail> reasoningEncrypted(EncryptedReasoningDetail v) {
			this._kind = Kind.ReasoningEncrypted;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ReasoningDetail> reasoningEncrypted(
				Function<EncryptedReasoningDetail.Builder, ObjectBuilder<EncryptedReasoningDetail>> fn) {
			return this.reasoningEncrypted(fn.apply(new EncryptedReasoningDetail.Builder()).build());
		}

		public ObjectBuilder<ReasoningDetail> reasoningSummary(SummaryReasoningDetail v) {
			this._kind = Kind.ReasoningSummary;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ReasoningDetail> reasoningSummary(
				Function<SummaryReasoningDetail.Builder, ObjectBuilder<SummaryReasoningDetail>> fn) {
			return this.reasoningSummary(fn.apply(new SummaryReasoningDetail.Builder()).build());
		}

		public ObjectBuilder<ReasoningDetail> reasoningText(TextReasoningDetail v) {
			this._kind = Kind.ReasoningText;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ReasoningDetail> reasoningText(
				Function<TextReasoningDetail.Builder, ObjectBuilder<TextReasoningDetail>> fn) {
			return this.reasoningText(fn.apply(new TextReasoningDetail.Builder()).build());
		}

		public ReasoningDetail build() {
			_checkSingleUse();
			return new ReasoningDetail(this);
		}

	}

	protected static void setupReasoningDetailDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::reasoningEncrypted, EncryptedReasoningDetail._DESERIALIZER, "reasoning.encrypted");
		op.add(Builder::reasoningSummary, SummaryReasoningDetail._DESERIALIZER, "reasoning.summary");
		op.add(Builder::reasoningText, TextReasoningDetail._DESERIALIZER, "reasoning.text");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<ReasoningDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReasoningDetail::setupReasoningDetailDeserializer, Builder::build);
}
