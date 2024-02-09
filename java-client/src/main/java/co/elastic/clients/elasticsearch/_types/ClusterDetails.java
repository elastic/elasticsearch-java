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

package co.elastic.clients.elasticsearch._types;

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

// typedef: _types.ClusterDetails

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.ClusterDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterDetails implements JsonpSerializable {
	private final ClusterSearchStatus status;

	private final String indices;

	@Nullable
	private final Long took;

	private final boolean timedOut;

	@Nullable
	private final ShardStatistics shards;

	private final List<ShardFailure> failures;

	// ---------------------------------------------------------------------------------------------

	private ClusterDetails(Builder builder) {

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.indices = ApiTypeHelper.requireNonNull(builder.indices, this, "indices");
		this.took = builder.took;
		this.timedOut = ApiTypeHelper.requireNonNull(builder.timedOut, this, "timedOut");
		this.shards = builder.shards;
		this.failures = ApiTypeHelper.unmodifiable(builder.failures);

	}

	public static ClusterDetails of(Function<Builder, ObjectBuilder<ClusterDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ClusterSearchStatus status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final String indices() {
		return this.indices;
	}

	/**
	 * API name: {@code took}
	 */
	@Nullable
	public final Long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code timed_out}
	 */
	public final boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code _shards}
	 */
	@Nullable
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<ShardFailure> failures() {
		return this.failures;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		generator.writeKey("indices");
		generator.write(this.indices);

		if (this.took != null) {
			generator.writeKey("took");
			generator.write(this.took);

		}
		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		if (this.shards != null) {
			generator.writeKey("_shards");
			this.shards.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ShardFailure item0 : this.failures) {
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
	 * Builder for {@link ClusterDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterDetails> {
		private ClusterSearchStatus status;

		private String indices;

		@Nullable
		private Long took;

		private Boolean timedOut;

		@Nullable
		private ShardStatistics shards;

		@Nullable
		private List<ShardFailure> failures;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ClusterSearchStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(String value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public final Builder took(@Nullable Long value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - API name: {@code timed_out}
		 */
		public final Builder timedOut(boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public final Builder shards(@Nullable ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>failures</code>.
		 */
		public final Builder failures(List<ShardFailure> list) {
			this.failures = _listAddAll(this.failures, list);
			return this;
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds one or more values to <code>failures</code>.
		 */
		public final Builder failures(ShardFailure value, ShardFailure... values) {
			this.failures = _listAdd(this.failures, value, values);
			return this;
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds a value to <code>failures</code> using a builder lambda.
		 */
		public final Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return failures(fn.apply(new ShardFailure.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterDetails build() {
			_checkSingleUse();

			return new ClusterDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterDetails}
	 */
	public static final JsonpDeserializer<ClusterDetails> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterDetails::setupClusterDetailsDeserializer);

	protected static void setupClusterDetailsDeserializer(ObjectDeserializer<ClusterDetails.Builder> op) {

		op.add(Builder::status, ClusterSearchStatus._DESERIALIZER, "status");
		op.add(Builder::indices, JsonpDeserializer.stringDeserializer(), "indices");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure._DESERIALIZER), "failures");

	}

}
