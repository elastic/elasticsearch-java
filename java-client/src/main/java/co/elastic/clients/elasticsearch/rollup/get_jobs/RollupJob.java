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

package co.elastic.clients.elasticsearch.rollup.get_jobs;

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

// typedef: rollup.get_jobs.RollupJob

/**
 *
 * @see <a href="../../doc-files/api-spec.html#rollup.get_jobs.RollupJob">API
 *      specification</a>
 */
@JsonpDeserializable
public class RollupJob implements JsonpSerializable {
	private final RollupJobConfiguration config;

	private final RollupJobStats stats;

	private final RollupJobStatus status;

	// ---------------------------------------------------------------------------------------------

	private RollupJob(Builder builder) {

		this.config = ApiTypeHelper.requireNonNull(builder.config, this, "config");
		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static RollupJob of(Function<Builder, ObjectBuilder<RollupJob>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code config}
	 */
	public final RollupJobConfiguration config() {
		return this.config;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final RollupJobStats stats() {
		return this.stats;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final RollupJobStatus status() {
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

		generator.writeKey("config");
		this.config.serialize(generator, mapper);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJob}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RollupJob> {
		private RollupJobConfiguration config;

		private RollupJobStats stats;

		private RollupJobStatus status;

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(RollupJobConfiguration value) {
			this.config = value;
			return this;
		}

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(
				Function<RollupJobConfiguration.Builder, ObjectBuilder<RollupJobConfiguration>> fn) {
			return this.config(fn.apply(new RollupJobConfiguration.Builder()).build());
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(RollupJobStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<RollupJobStats.Builder, ObjectBuilder<RollupJobStats>> fn) {
			return this.stats(fn.apply(new RollupJobStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(RollupJobStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(Function<RollupJobStatus.Builder, ObjectBuilder<RollupJobStatus>> fn) {
			return this.status(fn.apply(new RollupJobStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RollupJob}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJob build() {
			_checkSingleUse();

			return new RollupJob(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupJob}
	 */
	public static final JsonpDeserializer<RollupJob> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RollupJob::setupRollupJobDeserializer);

	protected static void setupRollupJobDeserializer(ObjectDeserializer<RollupJob.Builder> op) {

		op.add(Builder::config, RollupJobConfiguration._DESERIALIZER, "config");
		op.add(Builder::stats, RollupJobStats._DESERIALIZER, "stats");
		op.add(Builder::status, RollupJobStatus._DESERIALIZER, "status");

	}

}
