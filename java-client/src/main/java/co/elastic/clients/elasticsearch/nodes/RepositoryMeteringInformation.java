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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Boolean;
import java.lang.Long;
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

// typedef: nodes._types.RepositoryMeteringInformation

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.RepositoryMeteringInformation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositoryMeteringInformation implements JsonpSerializable {
	private final String repositoryName;

	private final String repositoryType;

	private final RepositoryLocation repositoryLocation;

	private final String repositoryEphemeralId;

	private final long repositoryStartedAt;

	@Nullable
	private final Long repositoryStoppedAt;

	private final boolean archived;

	@Nullable
	private final Long clusterVersion;

	private final RequestCounts requestCounts;

	// ---------------------------------------------------------------------------------------------

	private RepositoryMeteringInformation(Builder builder) {

		this.repositoryName = ApiTypeHelper.requireNonNull(builder.repositoryName, this, "repositoryName");
		this.repositoryType = ApiTypeHelper.requireNonNull(builder.repositoryType, this, "repositoryType");
		this.repositoryLocation = ApiTypeHelper.requireNonNull(builder.repositoryLocation, this, "repositoryLocation");
		this.repositoryEphemeralId = ApiTypeHelper.requireNonNull(builder.repositoryEphemeralId, this,
				"repositoryEphemeralId");
		this.repositoryStartedAt = ApiTypeHelper.requireNonNull(builder.repositoryStartedAt, this,
				"repositoryStartedAt");
		this.repositoryStoppedAt = builder.repositoryStoppedAt;
		this.archived = ApiTypeHelper.requireNonNull(builder.archived, this, "archived");
		this.clusterVersion = builder.clusterVersion;
		this.requestCounts = ApiTypeHelper.requireNonNull(builder.requestCounts, this, "requestCounts");

	}

	public static RepositoryMeteringInformation of(Function<Builder, ObjectBuilder<RepositoryMeteringInformation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Repository name.
	 * <p>
	 * API name: {@code repository_name}
	 */
	public final String repositoryName() {
		return this.repositoryName;
	}

	/**
	 * Required - Repository type.
	 * <p>
	 * API name: {@code repository_type}
	 */
	public final String repositoryType() {
		return this.repositoryType;
	}

	/**
	 * Required - Represents an unique location within the repository.
	 * <p>
	 * API name: {@code repository_location}
	 */
	public final RepositoryLocation repositoryLocation() {
		return this.repositoryLocation;
	}

	/**
	 * Required - An identifier that changes every time the repository is updated.
	 * <p>
	 * API name: {@code repository_ephemeral_id}
	 */
	public final String repositoryEphemeralId() {
		return this.repositoryEphemeralId;
	}

	/**
	 * Required - Time the repository was created or updated. Recorded in
	 * milliseconds since the Unix Epoch.
	 * <p>
	 * API name: {@code repository_started_at}
	 */
	public final long repositoryStartedAt() {
		return this.repositoryStartedAt;
	}

	/**
	 * Time the repository was deleted or updated. Recorded in milliseconds since
	 * the Unix Epoch.
	 * <p>
	 * API name: {@code repository_stopped_at}
	 */
	@Nullable
	public final Long repositoryStoppedAt() {
		return this.repositoryStoppedAt;
	}

	/**
	 * Required - A flag that tells whether or not this object has been archived.
	 * When a repository is closed or updated the repository metering information is
	 * archived and kept for a certain period of time. This allows retrieving the
	 * repository metering information of previous repository instantiations.
	 * <p>
	 * API name: {@code archived}
	 */
	public final boolean archived() {
		return this.archived;
	}

	/**
	 * The cluster state version when this object was archived, this field can be
	 * used as a logical timestamp to delete all the archived metrics up to an
	 * observed version. This field is only present for archived repository metering
	 * information objects. The main purpose of this field is to avoid possible race
	 * conditions during repository metering information deletions, i.e. deleting
	 * archived repositories metering information that we haven’t observed yet.
	 * <p>
	 * API name: {@code cluster_version}
	 */
	@Nullable
	public final Long clusterVersion() {
		return this.clusterVersion;
	}

	/**
	 * Required - An object with the number of request performed against the
	 * repository grouped by request type.
	 * <p>
	 * API name: {@code request_counts}
	 */
	public final RequestCounts requestCounts() {
		return this.requestCounts;
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

		generator.writeKey("repository_name");
		generator.write(this.repositoryName);

		generator.writeKey("repository_type");
		generator.write(this.repositoryType);

		generator.writeKey("repository_location");
		this.repositoryLocation.serialize(generator, mapper);

		generator.writeKey("repository_ephemeral_id");
		generator.write(this.repositoryEphemeralId);

		generator.writeKey("repository_started_at");
		generator.write(this.repositoryStartedAt);

		if (this.repositoryStoppedAt != null) {
			generator.writeKey("repository_stopped_at");
			generator.write(this.repositoryStoppedAt);

		}
		generator.writeKey("archived");
		generator.write(this.archived);

		if (this.clusterVersion != null) {
			generator.writeKey("cluster_version");
			generator.write(this.clusterVersion);

		}
		generator.writeKey("request_counts");
		this.requestCounts.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoryMeteringInformation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositoryMeteringInformation> {
		private String repositoryName;

		private String repositoryType;

		private RepositoryLocation repositoryLocation;

		private String repositoryEphemeralId;

		private Long repositoryStartedAt;

		@Nullable
		private Long repositoryStoppedAt;

		private Boolean archived;

		@Nullable
		private Long clusterVersion;

		private RequestCounts requestCounts;

		/**
		 * Required - Repository name.
		 * <p>
		 * API name: {@code repository_name}
		 */
		public final Builder repositoryName(String value) {
			this.repositoryName = value;
			return this;
		}

		/**
		 * Required - Repository type.
		 * <p>
		 * API name: {@code repository_type}
		 */
		public final Builder repositoryType(String value) {
			this.repositoryType = value;
			return this;
		}

		/**
		 * Required - Represents an unique location within the repository.
		 * <p>
		 * API name: {@code repository_location}
		 */
		public final Builder repositoryLocation(RepositoryLocation value) {
			this.repositoryLocation = value;
			return this;
		}

		/**
		 * Required - Represents an unique location within the repository.
		 * <p>
		 * API name: {@code repository_location}
		 */
		public final Builder repositoryLocation(
				Function<RepositoryLocation.Builder, ObjectBuilder<RepositoryLocation>> fn) {
			return this.repositoryLocation(fn.apply(new RepositoryLocation.Builder()).build());
		}

		/**
		 * Required - An identifier that changes every time the repository is updated.
		 * <p>
		 * API name: {@code repository_ephemeral_id}
		 */
		public final Builder repositoryEphemeralId(String value) {
			this.repositoryEphemeralId = value;
			return this;
		}

		/**
		 * Required - Time the repository was created or updated. Recorded in
		 * milliseconds since the Unix Epoch.
		 * <p>
		 * API name: {@code repository_started_at}
		 */
		public final Builder repositoryStartedAt(long value) {
			this.repositoryStartedAt = value;
			return this;
		}

		/**
		 * Time the repository was deleted or updated. Recorded in milliseconds since
		 * the Unix Epoch.
		 * <p>
		 * API name: {@code repository_stopped_at}
		 */
		public final Builder repositoryStoppedAt(@Nullable Long value) {
			this.repositoryStoppedAt = value;
			return this;
		}

		/**
		 * Required - A flag that tells whether or not this object has been archived.
		 * When a repository is closed or updated the repository metering information is
		 * archived and kept for a certain period of time. This allows retrieving the
		 * repository metering information of previous repository instantiations.
		 * <p>
		 * API name: {@code archived}
		 */
		public final Builder archived(boolean value) {
			this.archived = value;
			return this;
		}

		/**
		 * The cluster state version when this object was archived, this field can be
		 * used as a logical timestamp to delete all the archived metrics up to an
		 * observed version. This field is only present for archived repository metering
		 * information objects. The main purpose of this field is to avoid possible race
		 * conditions during repository metering information deletions, i.e. deleting
		 * archived repositories metering information that we haven’t observed yet.
		 * <p>
		 * API name: {@code cluster_version}
		 */
		public final Builder clusterVersion(@Nullable Long value) {
			this.clusterVersion = value;
			return this;
		}

		/**
		 * Required - An object with the number of request performed against the
		 * repository grouped by request type.
		 * <p>
		 * API name: {@code request_counts}
		 */
		public final Builder requestCounts(RequestCounts value) {
			this.requestCounts = value;
			return this;
		}

		/**
		 * Required - An object with the number of request performed against the
		 * repository grouped by request type.
		 * <p>
		 * API name: {@code request_counts}
		 */
		public final Builder requestCounts(Function<RequestCounts.Builder, ObjectBuilder<RequestCounts>> fn) {
			return this.requestCounts(fn.apply(new RequestCounts.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryMeteringInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryMeteringInformation build() {
			_checkSingleUse();

			return new RepositoryMeteringInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositoryMeteringInformation}
	 */
	public static final JsonpDeserializer<RepositoryMeteringInformation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositoryMeteringInformation::setupRepositoryMeteringInformationDeserializer);

	protected static void setupRepositoryMeteringInformationDeserializer(
			ObjectDeserializer<RepositoryMeteringInformation.Builder> op) {

		op.add(Builder::repositoryName, JsonpDeserializer.stringDeserializer(), "repository_name");
		op.add(Builder::repositoryType, JsonpDeserializer.stringDeserializer(), "repository_type");
		op.add(Builder::repositoryLocation, RepositoryLocation._DESERIALIZER, "repository_location");
		op.add(Builder::repositoryEphemeralId, JsonpDeserializer.stringDeserializer(), "repository_ephemeral_id");
		op.add(Builder::repositoryStartedAt, JsonpDeserializer.longDeserializer(), "repository_started_at");
		op.add(Builder::repositoryStoppedAt, JsonpDeserializer.longDeserializer(), "repository_stopped_at");
		op.add(Builder::archived, JsonpDeserializer.booleanDeserializer(), "archived");
		op.add(Builder::clusterVersion, JsonpDeserializer.longDeserializer(), "cluster_version");
		op.add(Builder::requestCounts, RequestCounts._DESERIALIZER, "request_counts");

	}

}
