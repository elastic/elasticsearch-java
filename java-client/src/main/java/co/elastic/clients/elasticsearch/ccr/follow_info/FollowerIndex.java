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

package co.elastic.clients.elasticsearch.ccr.follow_info;

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
import java.lang.String;
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

// typedef: ccr.follow_info.FollowerIndex

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ccr.follow_info.FollowerIndex">API
 *      specification</a>
 */
@JsonpDeserializable
public class FollowerIndex implements JsonpSerializable {
	private final String followerIndex;

	private final String leaderIndex;

	@Nullable
	private final FollowerIndexParameters parameters;

	private final String remoteCluster;

	private final FollowerIndexStatus status;

	// ---------------------------------------------------------------------------------------------

	private FollowerIndex(Builder builder) {

		this.followerIndex = ApiTypeHelper.requireNonNull(builder.followerIndex, this, "followerIndex");
		this.leaderIndex = ApiTypeHelper.requireNonNull(builder.leaderIndex, this, "leaderIndex");
		this.parameters = builder.parameters;
		this.remoteCluster = ApiTypeHelper.requireNonNull(builder.remoteCluster, this, "remoteCluster");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static FollowerIndex of(Function<Builder, ObjectBuilder<FollowerIndex>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code follower_index}
	 */
	public final String followerIndex() {
		return this.followerIndex;
	}

	/**
	 * Required - API name: {@code leader_index}
	 */
	public final String leaderIndex() {
		return this.leaderIndex;
	}

	/**
	 * API name: {@code parameters}
	 */
	@Nullable
	public final FollowerIndexParameters parameters() {
		return this.parameters;
	}

	/**
	 * Required - API name: {@code remote_cluster}
	 */
	public final String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final FollowerIndexStatus status() {
		return this.status;
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

		generator.writeKey("follower_index");
		generator.write(this.followerIndex);

		generator.writeKey("leader_index");
		generator.write(this.leaderIndex);

		if (this.parameters != null) {
			generator.writeKey("parameters");
			this.parameters.serialize(generator, mapper);

		}
		generator.writeKey("remote_cluster");
		generator.write(this.remoteCluster);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowerIndex}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FollowerIndex> {
		private String followerIndex;

		private String leaderIndex;

		@Nullable
		private FollowerIndexParameters parameters;

		private String remoteCluster;

		private FollowerIndexStatus status;

		/**
		 * Required - API name: {@code follower_index}
		 */
		public final Builder followerIndex(String value) {
			this.followerIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code leader_index}
		 */
		public final Builder leaderIndex(String value) {
			this.leaderIndex = value;
			return this;
		}

		/**
		 * API name: {@code parameters}
		 */
		public final Builder parameters(@Nullable FollowerIndexParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * API name: {@code parameters}
		 */
		public final Builder parameters(
				Function<FollowerIndexParameters.Builder, ObjectBuilder<FollowerIndexParameters>> fn) {
			return this.parameters(fn.apply(new FollowerIndexParameters.Builder()).build());
		}

		/**
		 * Required - API name: {@code remote_cluster}
		 */
		public final Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(FollowerIndexStatus value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FollowerIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowerIndex build() {
			_checkSingleUse();

			return new FollowerIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowerIndex}
	 */
	public static final JsonpDeserializer<FollowerIndex> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FollowerIndex::setupFollowerIndexDeserializer);

	protected static void setupFollowerIndexDeserializer(ObjectDeserializer<FollowerIndex.Builder> op) {

		op.add(Builder::followerIndex, JsonpDeserializer.stringDeserializer(), "follower_index");
		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::parameters, FollowerIndexParameters._DESERIALIZER, "parameters");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");
		op.add(Builder::status, FollowerIndexStatus._DESERIALIZER, "status");

	}

}
