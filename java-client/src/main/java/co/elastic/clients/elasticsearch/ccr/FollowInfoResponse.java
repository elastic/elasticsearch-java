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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch.ccr.follow_info.FollowerIndex;
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

// typedef: ccr.follow_info.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ccr.follow_info.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class FollowInfoResponse implements JsonpSerializable {
	private final List<FollowerIndex> followerIndices;

	// ---------------------------------------------------------------------------------------------

	private FollowInfoResponse(Builder builder) {

		this.followerIndices = ApiTypeHelper.unmodifiableRequired(builder.followerIndices, this, "followerIndices");

	}

	public static FollowInfoResponse of(Function<Builder, ObjectBuilder<FollowInfoResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code follower_indices}
	 */
	public final List<FollowerIndex> followerIndices() {
		return this.followerIndices;
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

		if (ApiTypeHelper.isDefined(this.followerIndices)) {
			generator.writeKey("follower_indices");
			generator.writeStartArray();
			for (FollowerIndex item0 : this.followerIndices) {
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
	 * Builder for {@link FollowInfoResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FollowInfoResponse> {
		private List<FollowerIndex> followerIndices;

		/**
		 * Required - API name: {@code follower_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>followerIndices</code>.
		 */
		public final Builder followerIndices(List<FollowerIndex> list) {
			this.followerIndices = _listAddAll(this.followerIndices, list);
			return this;
		}

		/**
		 * Required - API name: {@code follower_indices}
		 * <p>
		 * Adds one or more values to <code>followerIndices</code>.
		 */
		public final Builder followerIndices(FollowerIndex value, FollowerIndex... values) {
			this.followerIndices = _listAdd(this.followerIndices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code follower_indices}
		 * <p>
		 * Adds a value to <code>followerIndices</code> using a builder lambda.
		 */
		public final Builder followerIndices(Function<FollowerIndex.Builder, ObjectBuilder<FollowerIndex>> fn) {
			return followerIndices(fn.apply(new FollowerIndex.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FollowInfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowInfoResponse build() {
			_checkSingleUse();

			return new FollowInfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowInfoResponse}
	 */
	public static final JsonpDeserializer<FollowInfoResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FollowInfoResponse::setupFollowInfoResponseDeserializer);

	protected static void setupFollowInfoResponseDeserializer(ObjectDeserializer<FollowInfoResponse.Builder> op) {

		op.add(Builder::followerIndices, JsonpDeserializer.arrayDeserializer(FollowerIndex._DESERIALIZER),
				"follower_indices");

	}

}
