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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.CgroupCpu

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.CgroupCpu">API
 *      specification</a>
 */
@JsonpDeserializable
public class CgroupCpu implements JsonpSerializable {
	@Nullable
	private final String controlGroup;

	@Nullable
	private final Integer cfsPeriodMicros;

	@Nullable
	private final Integer cfsQuotaMicros;

	@Nullable
	private final CgroupCpuStat stat;

	// ---------------------------------------------------------------------------------------------

	private CgroupCpu(Builder builder) {

		this.controlGroup = builder.controlGroup;
		this.cfsPeriodMicros = builder.cfsPeriodMicros;
		this.cfsQuotaMicros = builder.cfsQuotaMicros;
		this.stat = builder.stat;

	}

	public static CgroupCpu of(Function<Builder, ObjectBuilder<CgroupCpu>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code control_group}
	 */
	@Nullable
	public final String controlGroup() {
		return this.controlGroup;
	}

	/**
	 * API name: {@code cfs_period_micros}
	 */
	@Nullable
	public final Integer cfsPeriodMicros() {
		return this.cfsPeriodMicros;
	}

	/**
	 * API name: {@code cfs_quota_micros}
	 */
	@Nullable
	public final Integer cfsQuotaMicros() {
		return this.cfsQuotaMicros;
	}

	/**
	 * API name: {@code stat}
	 */
	@Nullable
	public final CgroupCpuStat stat() {
		return this.stat;
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

		if (this.controlGroup != null) {
			generator.writeKey("control_group");
			generator.write(this.controlGroup);

		}
		if (this.cfsPeriodMicros != null) {
			generator.writeKey("cfs_period_micros");
			generator.write(this.cfsPeriodMicros);

		}
		if (this.cfsQuotaMicros != null) {
			generator.writeKey("cfs_quota_micros");
			generator.write(this.cfsQuotaMicros);

		}
		if (this.stat != null) {
			generator.writeKey("stat");
			this.stat.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CgroupCpu}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CgroupCpu> {
		@Nullable
		private String controlGroup;

		@Nullable
		private Integer cfsPeriodMicros;

		@Nullable
		private Integer cfsQuotaMicros;

		@Nullable
		private CgroupCpuStat stat;

		/**
		 * API name: {@code control_group}
		 */
		public final Builder controlGroup(@Nullable String value) {
			this.controlGroup = value;
			return this;
		}

		/**
		 * API name: {@code cfs_period_micros}
		 */
		public final Builder cfsPeriodMicros(@Nullable Integer value) {
			this.cfsPeriodMicros = value;
			return this;
		}

		/**
		 * API name: {@code cfs_quota_micros}
		 */
		public final Builder cfsQuotaMicros(@Nullable Integer value) {
			this.cfsQuotaMicros = value;
			return this;
		}

		/**
		 * API name: {@code stat}
		 */
		public final Builder stat(@Nullable CgroupCpuStat value) {
			this.stat = value;
			return this;
		}

		/**
		 * API name: {@code stat}
		 */
		public final Builder stat(Function<CgroupCpuStat.Builder, ObjectBuilder<CgroupCpuStat>> fn) {
			return this.stat(fn.apply(new CgroupCpuStat.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CgroupCpu}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CgroupCpu build() {
			_checkSingleUse();

			return new CgroupCpu(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CgroupCpu}
	 */
	public static final JsonpDeserializer<CgroupCpu> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CgroupCpu::setupCgroupCpuDeserializer);

	protected static void setupCgroupCpuDeserializer(ObjectDeserializer<CgroupCpu.Builder> op) {

		op.add(Builder::controlGroup, JsonpDeserializer.stringDeserializer(), "control_group");
		op.add(Builder::cfsPeriodMicros, JsonpDeserializer.integerDeserializer(), "cfs_period_micros");
		op.add(Builder::cfsQuotaMicros, JsonpDeserializer.integerDeserializer(), "cfs_quota_micros");
		op.add(Builder::stat, CgroupCpuStat._DESERIALIZER, "stat");

	}

}
