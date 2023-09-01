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

package co.elastic.clients.elasticsearch.synonyms;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: synonyms.get_synonym.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#synonyms.get_synonym.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSynonymResponse implements JsonpSerializable {
	private final int count;

	private final List<SynonymRuleRead> synonymsSet;

	// ---------------------------------------------------------------------------------------------

	private GetSynonymResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.synonymsSet = ApiTypeHelper.unmodifiableRequired(builder.synonymsSet, this, "synonymsSet");

	}

	public static GetSynonymResponse of(Function<Builder, ObjectBuilder<GetSynonymResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code synonyms_set}
	 */
	public final List<SynonymRuleRead> synonymsSet() {
		return this.synonymsSet;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.synonymsSet)) {
			generator.writeKey("synonyms_set");
			generator.writeStartArray();
			for (SynonymRuleRead item0 : this.synonymsSet) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSynonymResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetSynonymResponse> {
		private Integer count;

		private List<SynonymRuleRead> synonymsSet;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code synonyms_set}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>synonymsSet</code>.
		 */
		public final Builder synonymsSet(List<SynonymRuleRead> list) {
			this.synonymsSet = _listAddAll(this.synonymsSet, list);
			return this;
		}

		/**
		 * Required - API name: {@code synonyms_set}
		 * <p>
		 * Adds one or more values to <code>synonymsSet</code>.
		 */
		public final Builder synonymsSet(SynonymRuleRead value, SynonymRuleRead... values) {
			this.synonymsSet = _listAdd(this.synonymsSet, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code synonyms_set}
		 * <p>
		 * Adds a value to <code>synonymsSet</code> using a builder lambda.
		 */
		public final Builder synonymsSet(Function<SynonymRuleRead.Builder, ObjectBuilder<SynonymRuleRead>> fn) {
			return synonymsSet(fn.apply(new SynonymRuleRead.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSynonymResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSynonymResponse build() {
			_checkSingleUse();

			return new GetSynonymResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSynonymResponse}
	 */
	public static final JsonpDeserializer<GetSynonymResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSynonymResponse::setupGetSynonymResponseDeserializer);

	protected static void setupGetSynonymResponseDeserializer(ObjectDeserializer<GetSynonymResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::synonymsSet, JsonpDeserializer.arrayDeserializer(SynonymRuleRead._DESERIALIZER),
				"synonyms_set");

	}

}
