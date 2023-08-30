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

import co.elastic.clients.elasticsearch.synonyms.get_synonyms_sets.SynonymsSetItem;
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

// typedef: synonyms.get_synonyms_sets.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#synonyms.get_synonyms_sets.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSynonymsSetsResponse implements JsonpSerializable {
	private final int count;

	private final List<SynonymsSetItem> results;

	// ---------------------------------------------------------------------------------------------

	private GetSynonymsSetsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.results = ApiTypeHelper.unmodifiableRequired(builder.results, this, "results");

	}

	public static GetSynonymsSetsResponse of(Function<Builder, ObjectBuilder<GetSynonymsSetsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code results}
	 */
	public final List<SynonymsSetItem> results() {
		return this.results;
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

		if (ApiTypeHelper.isDefined(this.results)) {
			generator.writeKey("results");
			generator.writeStartArray();
			for (SynonymsSetItem item0 : this.results) {
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
	 * Builder for {@link GetSynonymsSetsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetSynonymsSetsResponse> {
		private Integer count;

		private List<SynonymsSetItem> results;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code results}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>results</code>.
		 */
		public final Builder results(List<SynonymsSetItem> list) {
			this.results = _listAddAll(this.results, list);
			return this;
		}

		/**
		 * Required - API name: {@code results}
		 * <p>
		 * Adds one or more values to <code>results</code>.
		 */
		public final Builder results(SynonymsSetItem value, SynonymsSetItem... values) {
			this.results = _listAdd(this.results, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code results}
		 * <p>
		 * Adds a value to <code>results</code> using a builder lambda.
		 */
		public final Builder results(Function<SynonymsSetItem.Builder, ObjectBuilder<SynonymsSetItem>> fn) {
			return results(fn.apply(new SynonymsSetItem.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSynonymsSetsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSynonymsSetsResponse build() {
			_checkSingleUse();

			return new GetSynonymsSetsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSynonymsSetsResponse}
	 */
	public static final JsonpDeserializer<GetSynonymsSetsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSynonymsSetsResponse::setupGetSynonymsSetsResponseDeserializer);

	protected static void setupGetSynonymsSetsResponseDeserializer(
			ObjectDeserializer<GetSynonymsSetsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::results, JsonpDeserializer.arrayDeserializer(SynonymsSetItem._DESERIALIZER), "results");

	}

}
