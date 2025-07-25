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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: cluster.stats.ClusterJvm

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cluster.stats.ClusterJvm">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterJvm implements JsonpSerializable {
	private final long maxUptimeInMillis;

	@Nullable
	private final Time maxUptime;

	private final ClusterJvmMemory mem;

	private final long threads;

	private final List<ClusterJvmVersion> versions;

	// ---------------------------------------------------------------------------------------------

	private ClusterJvm(Builder builder) {

		this.maxUptimeInMillis = ApiTypeHelper.requireNonNull(builder.maxUptimeInMillis, this, "maxUptimeInMillis", 0);
		this.maxUptime = builder.maxUptime;
		this.mem = ApiTypeHelper.requireNonNull(builder.mem, this, "mem");
		this.threads = ApiTypeHelper.requireNonNull(builder.threads, this, "threads", 0);
		this.versions = ApiTypeHelper.unmodifiableRequired(builder.versions, this, "versions");

	}

	public static ClusterJvm of(Function<Builder, ObjectBuilder<ClusterJvm>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Uptime duration, in milliseconds, since JVM last started.
	 * <p>
	 * API name: {@code max_uptime_in_millis}
	 */
	public final long maxUptimeInMillis() {
		return this.maxUptimeInMillis;
	}

	/**
	 * Uptime duration since JVM last started.
	 * <p>
	 * API name: {@code max_uptime}
	 */
	@Nullable
	public final Time maxUptime() {
		return this.maxUptime;
	}

	/**
	 * Required - Contains statistics about memory used by selected nodes.
	 * <p>
	 * API name: {@code mem}
	 */
	public final ClusterJvmMemory mem() {
		return this.mem;
	}

	/**
	 * Required - Number of active threads in use by JVM across all selected nodes.
	 * <p>
	 * API name: {@code threads}
	 */
	public final long threads() {
		return this.threads;
	}

	/**
	 * Required - Contains statistics about the JVM versions used by selected nodes.
	 * <p>
	 * API name: {@code versions}
	 */
	public final List<ClusterJvmVersion> versions() {
		return this.versions;
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

		generator.writeKey("max_uptime_in_millis");
		generator.write(this.maxUptimeInMillis);

		if (this.maxUptime != null) {
			generator.writeKey("max_uptime");
			this.maxUptime.serialize(generator, mapper);

		}
		generator.writeKey("mem");
		this.mem.serialize(generator, mapper);

		generator.writeKey("threads");
		generator.write(this.threads);

		if (ApiTypeHelper.isDefined(this.versions)) {
			generator.writeKey("versions");
			generator.writeStartArray();
			for (ClusterJvmVersion item0 : this.versions) {
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
	 * Builder for {@link ClusterJvm}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterJvm> {
		private Long maxUptimeInMillis;

		@Nullable
		private Time maxUptime;

		private ClusterJvmMemory mem;

		private Long threads;

		private List<ClusterJvmVersion> versions;

		/**
		 * Required - Uptime duration, in milliseconds, since JVM last started.
		 * <p>
		 * API name: {@code max_uptime_in_millis}
		 */
		public final Builder maxUptimeInMillis(long value) {
			this.maxUptimeInMillis = value;
			return this;
		}

		/**
		 * Uptime duration since JVM last started.
		 * <p>
		 * API name: {@code max_uptime}
		 */
		public final Builder maxUptime(@Nullable Time value) {
			this.maxUptime = value;
			return this;
		}

		/**
		 * Uptime duration since JVM last started.
		 * <p>
		 * API name: {@code max_uptime}
		 */
		public final Builder maxUptime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.maxUptime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Contains statistics about memory used by selected nodes.
		 * <p>
		 * API name: {@code mem}
		 */
		public final Builder mem(ClusterJvmMemory value) {
			this.mem = value;
			return this;
		}

		/**
		 * Required - Contains statistics about memory used by selected nodes.
		 * <p>
		 * API name: {@code mem}
		 */
		public final Builder mem(Function<ClusterJvmMemory.Builder, ObjectBuilder<ClusterJvmMemory>> fn) {
			return this.mem(fn.apply(new ClusterJvmMemory.Builder()).build());
		}

		/**
		 * Required - Number of active threads in use by JVM across all selected nodes.
		 * <p>
		 * API name: {@code threads}
		 */
		public final Builder threads(long value) {
			this.threads = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the JVM versions used by selected nodes.
		 * <p>
		 * API name: {@code versions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>versions</code>.
		 */
		public final Builder versions(List<ClusterJvmVersion> list) {
			this.versions = _listAddAll(this.versions, list);
			return this;
		}

		/**
		 * Required - Contains statistics about the JVM versions used by selected nodes.
		 * <p>
		 * API name: {@code versions}
		 * <p>
		 * Adds one or more values to <code>versions</code>.
		 */
		public final Builder versions(ClusterJvmVersion value, ClusterJvmVersion... values) {
			this.versions = _listAdd(this.versions, value, values);
			return this;
		}

		/**
		 * Required - Contains statistics about the JVM versions used by selected nodes.
		 * <p>
		 * API name: {@code versions}
		 * <p>
		 * Adds a value to <code>versions</code> using a builder lambda.
		 */
		public final Builder versions(Function<ClusterJvmVersion.Builder, ObjectBuilder<ClusterJvmVersion>> fn) {
			return versions(fn.apply(new ClusterJvmVersion.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterJvm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterJvm build() {
			_checkSingleUse();

			return new ClusterJvm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterJvm}
	 */
	public static final JsonpDeserializer<ClusterJvm> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterJvm::setupClusterJvmDeserializer);

	protected static void setupClusterJvmDeserializer(ObjectDeserializer<ClusterJvm.Builder> op) {

		op.add(Builder::maxUptimeInMillis, JsonpDeserializer.longDeserializer(), "max_uptime_in_millis");
		op.add(Builder::maxUptime, Time._DESERIALIZER, "max_uptime");
		op.add(Builder::mem, ClusterJvmMemory._DESERIALIZER, "mem");
		op.add(Builder::threads, JsonpDeserializer.longDeserializer(), "threads");
		op.add(Builder::versions, JsonpDeserializer.arrayDeserializer(ClusterJvmVersion._DESERIALIZER), "versions");

	}

}
