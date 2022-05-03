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
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_influencers.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_influencers.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetInfluencersResponse implements JsonpSerializable {
	private final long count;

	private final List<Influencer> influencers;

	// ---------------------------------------------------------------------------------------------

	private GetInfluencersResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.influencers = ApiTypeHelper.unmodifiableRequired(builder.influencers, this, "influencers");

	}

	public static GetInfluencersResponse of(Function<Builder, ObjectBuilder<GetInfluencersResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - Array of influencer objects
	 * <p>
	 * API name: {@code influencers}
	 */
	public final List<Influencer> influencers() {
		return this.influencers;
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

		if (ApiTypeHelper.isDefined(this.influencers)) {
			generator.writeKey("influencers");
			generator.writeStartArray();
			for (Influencer item0 : this.influencers) {
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
	 * Builder for {@link GetInfluencersResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetInfluencersResponse> {
		private Long count;

		private List<Influencer> influencers;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>influencers</code>.
		 */
		public final Builder influencers(List<Influencer> list) {
			this.influencers = _listAddAll(this.influencers, list);
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds one or more values to <code>influencers</code>.
		 */
		public final Builder influencers(Influencer value, Influencer... values) {
			this.influencers = _listAdd(this.influencers, value, values);
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds a value to <code>influencers</code> using a builder lambda.
		 */
		public final Builder influencers(Function<Influencer.Builder, ObjectBuilder<Influencer>> fn) {
			return influencers(fn.apply(new Influencer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetInfluencersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInfluencersResponse build() {
			_checkSingleUse();

			return new GetInfluencersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetInfluencersResponse}
	 */
	public static final JsonpDeserializer<GetInfluencersResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetInfluencersResponse::setupGetInfluencersResponseDeserializer);

	protected static void setupGetInfluencersResponseDeserializer(
			ObjectDeserializer<GetInfluencersResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(Influencer._DESERIALIZER), "influencers");

	}

}
