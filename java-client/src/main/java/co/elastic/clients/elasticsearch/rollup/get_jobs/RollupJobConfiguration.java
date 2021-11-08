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

package co.elastic.clients.elasticsearch.rollup.get_jobs;

import co.elastic.clients.elasticsearch.rollup.FieldMetric;
import co.elastic.clients.elasticsearch.rollup.Groupings;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_jobs.RollupJobConfiguration
@JsonpDeserializable
public class RollupJobConfiguration implements JsonpSerializable {
	private final String cron;

	private final Groupings groups;

	private final String id;

	private final String indexPattern;

	private final List<FieldMetric> metrics;

	private final long pageSize;

	private final String rollupIndex;

	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private RollupJobConfiguration(Builder builder) {

		this.cron = ModelTypeHelper.requireNonNull(builder.cron, this, "cron");
		this.groups = ModelTypeHelper.requireNonNull(builder.groups, this, "groups");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.indexPattern = ModelTypeHelper.requireNonNull(builder.indexPattern, this, "indexPattern");
		this.metrics = ModelTypeHelper.unmodifiableRequired(builder.metrics, this, "metrics");
		this.pageSize = ModelTypeHelper.requireNonNull(builder.pageSize, this, "pageSize");
		this.rollupIndex = ModelTypeHelper.requireNonNull(builder.rollupIndex, this, "rollupIndex");
		this.timeout = ModelTypeHelper.requireNonNull(builder.timeout, this, "timeout");

	}

	public static RollupJobConfiguration of(Function<Builder, ObjectBuilder<RollupJobConfiguration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cron}
	 */
	public final String cron() {
		return this.cron;
	}

	/**
	 * Required - API name: {@code groups}
	 */
	public final Groupings groups() {
		return this.groups;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index_pattern}
	 */
	public final String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * Required - API name: {@code metrics}
	 */
	public final List<FieldMetric> metrics() {
		return this.metrics;
	}

	/**
	 * Required - API name: {@code page_size}
	 */
	public final long pageSize() {
		return this.pageSize;
	}

	/**
	 * Required - API name: {@code rollup_index}
	 */
	public final String rollupIndex() {
		return this.rollupIndex;
	}

	/**
	 * Required - API name: {@code timeout}
	 */
	public final String timeout() {
		return this.timeout;
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

		generator.writeKey("cron");
		generator.write(this.cron);

		generator.writeKey("groups");
		this.groups.serialize(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index_pattern");
		generator.write(this.indexPattern);

		if (ModelTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartArray();
			for (FieldMetric item0 : this.metrics) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("page_size");
		generator.write(this.pageSize);

		generator.writeKey("rollup_index");
		generator.write(this.rollupIndex);

		generator.writeKey("timeout");
		generator.write(this.timeout);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobConfiguration}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RollupJobConfiguration> {
		private String cron;

		private Groupings groups;

		private String id;

		private String indexPattern;

		private List<FieldMetric> metrics;

		private Long pageSize;

		private String rollupIndex;

		private String timeout;

		/**
		 * Required - API name: {@code cron}
		 */
		public final Builder cron(String value) {
			this.cron = value;
			return this;
		}

		/**
		 * Required - API name: {@code groups}
		 */
		public final Builder groups(Groupings value) {
			this.groups = value;
			return this;
		}

		/**
		 * Required - API name: {@code groups}
		 */
		public final Builder groups(Function<Groupings.Builder, ObjectBuilder<Groupings>> fn) {
			return this.groups(fn.apply(new Groupings.Builder()).build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_pattern}
		 */
		public final Builder indexPattern(String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 */
		public final Builder metrics(List<FieldMetric> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 */
		public final Builder metrics(FieldMetric... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 */
		@SafeVarargs
		public final Builder metrics(Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>>... fns) {
			this.metrics = new ArrayList<>(fns.length);
			for (Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>> fn : fns) {
				this.metrics.add(fn.apply(new FieldMetric.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code page_size}
		 */
		public final Builder pageSize(long value) {
			this.pageSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup_index}
		 */
		public final Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code timeout}
		 */
		public final Builder timeout(String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link RollupJobConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobConfiguration build() {
			_checkSingleUse();

			return new RollupJobConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupJobConfiguration}
	 */
	public static final JsonpDeserializer<RollupJobConfiguration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RollupJobConfiguration::setupRollupJobConfigurationDeserializer, Builder::build);

	protected static void setupRollupJobConfigurationDeserializer(
			DelegatingDeserializer<RollupJobConfiguration.Builder> op) {

		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::groups, Groupings._DESERIALIZER, "groups");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(FieldMetric._DESERIALIZER), "metrics");
		op.add(Builder::pageSize, JsonpDeserializer.longDeserializer(), "page_size");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");

	}

}
