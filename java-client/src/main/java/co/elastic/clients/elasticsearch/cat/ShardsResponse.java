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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.shards.ShardsRecord;
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
import jakarta.json.stream.JsonParser;
import java.util.List;
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

// typedef: cat.shards.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.shards.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsResponse implements JsonpSerializable {
	private final List<ShardsRecord> shards;

	// ---------------------------------------------------------------------------------------------

	private ShardsResponse(Builder builder) {

		this.shards = ApiTypeHelper.unmodifiableRequired(builder.shards, this, "shards");

	}

	public static ShardsResponse of(Function<Builder, ObjectBuilder<ShardsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<ShardsRecord> shards() {
		return this.shards;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (ShardsRecord item0 : this.shards) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardsResponse> {
		private List<ShardsRecord> shards;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>shards</code>.
		 */
		public final Builder shards(List<ShardsRecord> list) {
			this.shards = _listAddAll(this.shards, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>shards</code>.
		 */
		public final Builder shards(ShardsRecord value, ShardsRecord... values) {
			this.shards = _listAdd(this.shards, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>shards</code> using a builder lambda.
		 */
		public final Builder shards(Function<ShardsRecord.Builder, ObjectBuilder<ShardsRecord>> fn) {
			return shards(fn.apply(new ShardsRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<ShardsRecord> value = (List<ShardsRecord>) JsonpDeserializer
					.arrayDeserializer(ShardsRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.shards(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsResponse build() {
			_checkSingleUse();

			return new ShardsResponse(this);
		}
	}

	public static final JsonpDeserializer<ShardsResponse> _DESERIALIZER = createShardsResponseDeserializer();
	protected static JsonpDeserializer<ShardsResponse> createShardsResponseDeserializer() {

		JsonpDeserializer<List<ShardsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(ShardsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.shards(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
