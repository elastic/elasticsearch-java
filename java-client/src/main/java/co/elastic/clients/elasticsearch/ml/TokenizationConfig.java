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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TokenizationConfigContainer

/**
 * Tokenization options stored in inference configuration
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TokenizationConfigContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class TokenizationConfig implements TaggedUnion<TokenizationConfig.Kind, Object>, JsonpSerializable {

	/**
	 * {@link TokenizationConfig} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#ml._types.TokenizationConfigContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Bert("bert"),

		Mpnet("mpnet"),

		Roberta("roberta"),

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
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public TokenizationConfig(TokenizationConfigVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._tokenizationConfigKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TokenizationConfig(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TokenizationConfig of(Function<Builder, ObjectBuilder<TokenizationConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code bert}?
	 */
	public boolean isBert() {
		return _kind == Kind.Bert;
	}

	/**
	 * Get the {@code bert} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bert} kind.
	 */
	public NlpBertTokenizationConfig bert() {
		return TaggedUnionUtils.get(this, Kind.Bert);
	}

	/**
	 * Is this variant instance of kind {@code mpnet}?
	 */
	public boolean isMpnet() {
		return _kind == Kind.Mpnet;
	}

	/**
	 * Get the {@code mpnet} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code mpnet} kind.
	 */
	public NlpBertTokenizationConfig mpnet() {
		return TaggedUnionUtils.get(this, Kind.Mpnet);
	}

	/**
	 * Is this variant instance of kind {@code roberta}?
	 */
	public boolean isRoberta() {
		return _kind == Kind.Roberta;
	}

	/**
	 * Get the {@code roberta} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code roberta} kind.
	 */
	public NlpRobertaTokenizationConfig roberta() {
		return TaggedUnionUtils.get(this, Kind.Roberta);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TokenizationConfig> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<TokenizationConfig> bert(NlpBertTokenizationConfig v) {
			this._kind = Kind.Bert;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizationConfig> bert(
				Function<NlpBertTokenizationConfig.Builder, ObjectBuilder<NlpBertTokenizationConfig>> fn) {
			return this.bert(fn.apply(new NlpBertTokenizationConfig.Builder()).build());
		}

		public ObjectBuilder<TokenizationConfig> mpnet(NlpBertTokenizationConfig v) {
			this._kind = Kind.Mpnet;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizationConfig> mpnet(
				Function<NlpBertTokenizationConfig.Builder, ObjectBuilder<NlpBertTokenizationConfig>> fn) {
			return this.mpnet(fn.apply(new NlpBertTokenizationConfig.Builder()).build());
		}

		public ObjectBuilder<TokenizationConfig> roberta(NlpRobertaTokenizationConfig v) {
			this._kind = Kind.Roberta;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizationConfig> roberta(
				Function<NlpRobertaTokenizationConfig.Builder, ObjectBuilder<NlpRobertaTokenizationConfig>> fn) {
			return this.roberta(fn.apply(new NlpRobertaTokenizationConfig.Builder()).build());
		}

		public TokenizationConfig build() {
			_checkSingleUse();
			return new TokenizationConfig(this);
		}

	}

	protected static void setupTokenizationConfigDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::bert, NlpBertTokenizationConfig._DESERIALIZER, "bert");
		op.add(Builder::mpnet, NlpBertTokenizationConfig._DESERIALIZER, "mpnet");
		op.add(Builder::roberta, NlpRobertaTokenizationConfig._DESERIALIZER, "roberta");

	}

	public static final JsonpDeserializer<TokenizationConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TokenizationConfig::setupTokenizationConfigDeserializer, Builder::build);
}
