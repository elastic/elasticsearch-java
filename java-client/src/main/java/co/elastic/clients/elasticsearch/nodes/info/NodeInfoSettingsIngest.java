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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsIngest
@JsonpDeserializable
public final class NodeInfoSettingsIngest implements JsonpSerializable {
	@Nullable
	private final NodeInfoIngestInfo attachment;

	@Nullable
	private final NodeInfoIngestInfo append;

	@Nullable
	private final NodeInfoIngestInfo csv;

	@Nullable
	private final NodeInfoIngestInfo convert;

	@Nullable
	private final NodeInfoIngestInfo date;

	@Nullable
	private final NodeInfoIngestInfo dateIndexName;

	@Nullable
	private final NodeInfoIngestInfo dotExpander;

	@Nullable
	private final NodeInfoIngestInfo enrich;

	@Nullable
	private final NodeInfoIngestInfo fail;

	@Nullable
	private final NodeInfoIngestInfo foreach;

	@Nullable
	private final NodeInfoIngestInfo json;

	@Nullable
	private final NodeInfoIngestInfo userAgent;

	@Nullable
	private final NodeInfoIngestInfo kv;

	@Nullable
	private final NodeInfoIngestInfo geoip;

	@Nullable
	private final NodeInfoIngestInfo grok;

	@Nullable
	private final NodeInfoIngestInfo gsub;

	@Nullable
	private final NodeInfoIngestInfo join;

	@Nullable
	private final NodeInfoIngestInfo lowercase;

	@Nullable
	private final NodeInfoIngestInfo remove;

	@Nullable
	private final NodeInfoIngestInfo rename;

	@Nullable
	private final NodeInfoIngestInfo script;

	@Nullable
	private final NodeInfoIngestInfo set;

	@Nullable
	private final NodeInfoIngestInfo sort;

	@Nullable
	private final NodeInfoIngestInfo split;

	@Nullable
	private final NodeInfoIngestInfo trim;

	@Nullable
	private final NodeInfoIngestInfo uppercase;

	@Nullable
	private final NodeInfoIngestInfo urldecode;

	@Nullable
	private final NodeInfoIngestInfo bytes;

	@Nullable
	private final NodeInfoIngestInfo dissect;

	@Nullable
	private final NodeInfoIngestInfo setSecurityUser;

	@Nullable
	private final NodeInfoIngestInfo pipeline;

	@Nullable
	private final NodeInfoIngestInfo drop;

	@Nullable
	private final NodeInfoIngestInfo circle;

	@Nullable
	private final NodeInfoIngestInfo inference;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoSettingsIngest(Builder builder) {

		this.attachment = builder.attachment;
		this.append = builder.append;
		this.csv = builder.csv;
		this.convert = builder.convert;
		this.date = builder.date;
		this.dateIndexName = builder.dateIndexName;
		this.dotExpander = builder.dotExpander;
		this.enrich = builder.enrich;
		this.fail = builder.fail;
		this.foreach = builder.foreach;
		this.json = builder.json;
		this.userAgent = builder.userAgent;
		this.kv = builder.kv;
		this.geoip = builder.geoip;
		this.grok = builder.grok;
		this.gsub = builder.gsub;
		this.join = builder.join;
		this.lowercase = builder.lowercase;
		this.remove = builder.remove;
		this.rename = builder.rename;
		this.script = builder.script;
		this.set = builder.set;
		this.sort = builder.sort;
		this.split = builder.split;
		this.trim = builder.trim;
		this.uppercase = builder.uppercase;
		this.urldecode = builder.urldecode;
		this.bytes = builder.bytes;
		this.dissect = builder.dissect;
		this.setSecurityUser = builder.setSecurityUser;
		this.pipeline = builder.pipeline;
		this.drop = builder.drop;
		this.circle = builder.circle;
		this.inference = builder.inference;

	}

	/**
	 * API name: {@code attachment}
	 */
	@Nullable
	public NodeInfoIngestInfo attachment() {
		return this.attachment;
	}

	/**
	 * API name: {@code append}
	 */
	@Nullable
	public NodeInfoIngestInfo append() {
		return this.append;
	}

	/**
	 * API name: {@code csv}
	 */
	@Nullable
	public NodeInfoIngestInfo csv() {
		return this.csv;
	}

	/**
	 * API name: {@code convert}
	 */
	@Nullable
	public NodeInfoIngestInfo convert() {
		return this.convert;
	}

	/**
	 * API name: {@code date}
	 */
	@Nullable
	public NodeInfoIngestInfo date() {
		return this.date;
	}

	/**
	 * API name: {@code date_index_name}
	 */
	@Nullable
	public NodeInfoIngestInfo dateIndexName() {
		return this.dateIndexName;
	}

	/**
	 * API name: {@code dot_expander}
	 */
	@Nullable
	public NodeInfoIngestInfo dotExpander() {
		return this.dotExpander;
	}

	/**
	 * API name: {@code enrich}
	 */
	@Nullable
	public NodeInfoIngestInfo enrich() {
		return this.enrich;
	}

	/**
	 * API name: {@code fail}
	 */
	@Nullable
	public NodeInfoIngestInfo fail() {
		return this.fail;
	}

	/**
	 * API name: {@code foreach}
	 */
	@Nullable
	public NodeInfoIngestInfo foreach() {
		return this.foreach;
	}

	/**
	 * API name: {@code json}
	 */
	@Nullable
	public NodeInfoIngestInfo json() {
		return this.json;
	}

	/**
	 * API name: {@code user_agent}
	 */
	@Nullable
	public NodeInfoIngestInfo userAgent() {
		return this.userAgent;
	}

	/**
	 * API name: {@code kv}
	 */
	@Nullable
	public NodeInfoIngestInfo kv() {
		return this.kv;
	}

	/**
	 * API name: {@code geoip}
	 */
	@Nullable
	public NodeInfoIngestInfo geoip() {
		return this.geoip;
	}

	/**
	 * API name: {@code grok}
	 */
	@Nullable
	public NodeInfoIngestInfo grok() {
		return this.grok;
	}

	/**
	 * API name: {@code gsub}
	 */
	@Nullable
	public NodeInfoIngestInfo gsub() {
		return this.gsub;
	}

	/**
	 * API name: {@code join}
	 */
	@Nullable
	public NodeInfoIngestInfo join() {
		return this.join;
	}

	/**
	 * API name: {@code lowercase}
	 */
	@Nullable
	public NodeInfoIngestInfo lowercase() {
		return this.lowercase;
	}

	/**
	 * API name: {@code remove}
	 */
	@Nullable
	public NodeInfoIngestInfo remove() {
		return this.remove;
	}

	/**
	 * API name: {@code rename}
	 */
	@Nullable
	public NodeInfoIngestInfo rename() {
		return this.rename;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public NodeInfoIngestInfo script() {
		return this.script;
	}

	/**
	 * API name: {@code set}
	 */
	@Nullable
	public NodeInfoIngestInfo set() {
		return this.set;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public NodeInfoIngestInfo sort() {
		return this.sort;
	}

	/**
	 * API name: {@code split}
	 */
	@Nullable
	public NodeInfoIngestInfo split() {
		return this.split;
	}

	/**
	 * API name: {@code trim}
	 */
	@Nullable
	public NodeInfoIngestInfo trim() {
		return this.trim;
	}

	/**
	 * API name: {@code uppercase}
	 */
	@Nullable
	public NodeInfoIngestInfo uppercase() {
		return this.uppercase;
	}

	/**
	 * API name: {@code urldecode}
	 */
	@Nullable
	public NodeInfoIngestInfo urldecode() {
		return this.urldecode;
	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public NodeInfoIngestInfo bytes() {
		return this.bytes;
	}

	/**
	 * API name: {@code dissect}
	 */
	@Nullable
	public NodeInfoIngestInfo dissect() {
		return this.dissect;
	}

	/**
	 * API name: {@code set_security_user}
	 */
	@Nullable
	public NodeInfoIngestInfo setSecurityUser() {
		return this.setSecurityUser;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public NodeInfoIngestInfo pipeline() {
		return this.pipeline;
	}

	/**
	 * API name: {@code drop}
	 */
	@Nullable
	public NodeInfoIngestInfo drop() {
		return this.drop;
	}

	/**
	 * API name: {@code circle}
	 */
	@Nullable
	public NodeInfoIngestInfo circle() {
		return this.circle;
	}

	/**
	 * API name: {@code inference}
	 */
	@Nullable
	public NodeInfoIngestInfo inference() {
		return this.inference;
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

		if (this.attachment != null) {

			generator.writeKey("attachment");
			this.attachment.serialize(generator, mapper);

		}
		if (this.append != null) {

			generator.writeKey("append");
			this.append.serialize(generator, mapper);

		}
		if (this.csv != null) {

			generator.writeKey("csv");
			this.csv.serialize(generator, mapper);

		}
		if (this.convert != null) {

			generator.writeKey("convert");
			this.convert.serialize(generator, mapper);

		}
		if (this.date != null) {

			generator.writeKey("date");
			this.date.serialize(generator, mapper);

		}
		if (this.dateIndexName != null) {

			generator.writeKey("date_index_name");
			this.dateIndexName.serialize(generator, mapper);

		}
		if (this.dotExpander != null) {

			generator.writeKey("dot_expander");
			this.dotExpander.serialize(generator, mapper);

		}
		if (this.enrich != null) {

			generator.writeKey("enrich");
			this.enrich.serialize(generator, mapper);

		}
		if (this.fail != null) {

			generator.writeKey("fail");
			this.fail.serialize(generator, mapper);

		}
		if (this.foreach != null) {

			generator.writeKey("foreach");
			this.foreach.serialize(generator, mapper);

		}
		if (this.json != null) {

			generator.writeKey("json");
			this.json.serialize(generator, mapper);

		}
		if (this.userAgent != null) {

			generator.writeKey("user_agent");
			this.userAgent.serialize(generator, mapper);

		}
		if (this.kv != null) {

			generator.writeKey("kv");
			this.kv.serialize(generator, mapper);

		}
		if (this.geoip != null) {

			generator.writeKey("geoip");
			this.geoip.serialize(generator, mapper);

		}
		if (this.grok != null) {

			generator.writeKey("grok");
			this.grok.serialize(generator, mapper);

		}
		if (this.gsub != null) {

			generator.writeKey("gsub");
			this.gsub.serialize(generator, mapper);

		}
		if (this.join != null) {

			generator.writeKey("join");
			this.join.serialize(generator, mapper);

		}
		if (this.lowercase != null) {

			generator.writeKey("lowercase");
			this.lowercase.serialize(generator, mapper);

		}
		if (this.remove != null) {

			generator.writeKey("remove");
			this.remove.serialize(generator, mapper);

		}
		if (this.rename != null) {

			generator.writeKey("rename");
			this.rename.serialize(generator, mapper);

		}
		if (this.script != null) {

			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.set != null) {

			generator.writeKey("set");
			this.set.serialize(generator, mapper);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			this.sort.serialize(generator, mapper);

		}
		if (this.split != null) {

			generator.writeKey("split");
			this.split.serialize(generator, mapper);

		}
		if (this.trim != null) {

			generator.writeKey("trim");
			this.trim.serialize(generator, mapper);

		}
		if (this.uppercase != null) {

			generator.writeKey("uppercase");
			this.uppercase.serialize(generator, mapper);

		}
		if (this.urldecode != null) {

			generator.writeKey("urldecode");
			this.urldecode.serialize(generator, mapper);

		}
		if (this.bytes != null) {

			generator.writeKey("bytes");
			this.bytes.serialize(generator, mapper);

		}
		if (this.dissect != null) {

			generator.writeKey("dissect");
			this.dissect.serialize(generator, mapper);

		}
		if (this.setSecurityUser != null) {

			generator.writeKey("set_security_user");
			this.setSecurityUser.serialize(generator, mapper);

		}
		if (this.pipeline != null) {

			generator.writeKey("pipeline");
			this.pipeline.serialize(generator, mapper);

		}
		if (this.drop != null) {

			generator.writeKey("drop");
			this.drop.serialize(generator, mapper);

		}
		if (this.circle != null) {

			generator.writeKey("circle");
			this.circle.serialize(generator, mapper);

		}
		if (this.inference != null) {

			generator.writeKey("inference");
			this.inference.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsIngest}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsIngest> {
		@Nullable
		private NodeInfoIngestInfo attachment;

		@Nullable
		private NodeInfoIngestInfo append;

		@Nullable
		private NodeInfoIngestInfo csv;

		@Nullable
		private NodeInfoIngestInfo convert;

		@Nullable
		private NodeInfoIngestInfo date;

		@Nullable
		private NodeInfoIngestInfo dateIndexName;

		@Nullable
		private NodeInfoIngestInfo dotExpander;

		@Nullable
		private NodeInfoIngestInfo enrich;

		@Nullable
		private NodeInfoIngestInfo fail;

		@Nullable
		private NodeInfoIngestInfo foreach;

		@Nullable
		private NodeInfoIngestInfo json;

		@Nullable
		private NodeInfoIngestInfo userAgent;

		@Nullable
		private NodeInfoIngestInfo kv;

		@Nullable
		private NodeInfoIngestInfo geoip;

		@Nullable
		private NodeInfoIngestInfo grok;

		@Nullable
		private NodeInfoIngestInfo gsub;

		@Nullable
		private NodeInfoIngestInfo join;

		@Nullable
		private NodeInfoIngestInfo lowercase;

		@Nullable
		private NodeInfoIngestInfo remove;

		@Nullable
		private NodeInfoIngestInfo rename;

		@Nullable
		private NodeInfoIngestInfo script;

		@Nullable
		private NodeInfoIngestInfo set;

		@Nullable
		private NodeInfoIngestInfo sort;

		@Nullable
		private NodeInfoIngestInfo split;

		@Nullable
		private NodeInfoIngestInfo trim;

		@Nullable
		private NodeInfoIngestInfo uppercase;

		@Nullable
		private NodeInfoIngestInfo urldecode;

		@Nullable
		private NodeInfoIngestInfo bytes;

		@Nullable
		private NodeInfoIngestInfo dissect;

		@Nullable
		private NodeInfoIngestInfo setSecurityUser;

		@Nullable
		private NodeInfoIngestInfo pipeline;

		@Nullable
		private NodeInfoIngestInfo drop;

		@Nullable
		private NodeInfoIngestInfo circle;

		@Nullable
		private NodeInfoIngestInfo inference;

		/**
		 * API name: {@code attachment}
		 */
		public Builder attachment(@Nullable NodeInfoIngestInfo value) {
			this.attachment = value;
			return this;
		}

		/**
		 * API name: {@code attachment}
		 */
		public Builder attachment(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.attachment(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code append}
		 */
		public Builder append(@Nullable NodeInfoIngestInfo value) {
			this.append = value;
			return this;
		}

		/**
		 * API name: {@code append}
		 */
		public Builder append(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.append(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code csv}
		 */
		public Builder csv(@Nullable NodeInfoIngestInfo value) {
			this.csv = value;
			return this;
		}

		/**
		 * API name: {@code csv}
		 */
		public Builder csv(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.csv(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code convert}
		 */
		public Builder convert(@Nullable NodeInfoIngestInfo value) {
			this.convert = value;
			return this;
		}

		/**
		 * API name: {@code convert}
		 */
		public Builder convert(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.convert(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code date}
		 */
		public Builder date(@Nullable NodeInfoIngestInfo value) {
			this.date = value;
			return this;
		}

		/**
		 * API name: {@code date}
		 */
		public Builder date(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.date(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code date_index_name}
		 */
		public Builder dateIndexName(@Nullable NodeInfoIngestInfo value) {
			this.dateIndexName = value;
			return this;
		}

		/**
		 * API name: {@code date_index_name}
		 */
		public Builder dateIndexName(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.dateIndexName(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code dot_expander}
		 */
		public Builder dotExpander(@Nullable NodeInfoIngestInfo value) {
			this.dotExpander = value;
			return this;
		}

		/**
		 * API name: {@code dot_expander}
		 */
		public Builder dotExpander(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.dotExpander(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code enrich}
		 */
		public Builder enrich(@Nullable NodeInfoIngestInfo value) {
			this.enrich = value;
			return this;
		}

		/**
		 * API name: {@code enrich}
		 */
		public Builder enrich(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.enrich(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code fail}
		 */
		public Builder fail(@Nullable NodeInfoIngestInfo value) {
			this.fail = value;
			return this;
		}

		/**
		 * API name: {@code fail}
		 */
		public Builder fail(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.fail(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code foreach}
		 */
		public Builder foreach(@Nullable NodeInfoIngestInfo value) {
			this.foreach = value;
			return this;
		}

		/**
		 * API name: {@code foreach}
		 */
		public Builder foreach(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.foreach(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code json}
		 */
		public Builder json(@Nullable NodeInfoIngestInfo value) {
			this.json = value;
			return this;
		}

		/**
		 * API name: {@code json}
		 */
		public Builder json(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.json(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code user_agent}
		 */
		public Builder userAgent(@Nullable NodeInfoIngestInfo value) {
			this.userAgent = value;
			return this;
		}

		/**
		 * API name: {@code user_agent}
		 */
		public Builder userAgent(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.userAgent(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code kv}
		 */
		public Builder kv(@Nullable NodeInfoIngestInfo value) {
			this.kv = value;
			return this;
		}

		/**
		 * API name: {@code kv}
		 */
		public Builder kv(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.kv(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code geoip}
		 */
		public Builder geoip(@Nullable NodeInfoIngestInfo value) {
			this.geoip = value;
			return this;
		}

		/**
		 * API name: {@code geoip}
		 */
		public Builder geoip(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.geoip(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code grok}
		 */
		public Builder grok(@Nullable NodeInfoIngestInfo value) {
			this.grok = value;
			return this;
		}

		/**
		 * API name: {@code grok}
		 */
		public Builder grok(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.grok(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code gsub}
		 */
		public Builder gsub(@Nullable NodeInfoIngestInfo value) {
			this.gsub = value;
			return this;
		}

		/**
		 * API name: {@code gsub}
		 */
		public Builder gsub(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.gsub(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code join}
		 */
		public Builder join(@Nullable NodeInfoIngestInfo value) {
			this.join = value;
			return this;
		}

		/**
		 * API name: {@code join}
		 */
		public Builder join(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.join(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code lowercase}
		 */
		public Builder lowercase(@Nullable NodeInfoIngestInfo value) {
			this.lowercase = value;
			return this;
		}

		/**
		 * API name: {@code lowercase}
		 */
		public Builder lowercase(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.lowercase(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code remove}
		 */
		public Builder remove(@Nullable NodeInfoIngestInfo value) {
			this.remove = value;
			return this;
		}

		/**
		 * API name: {@code remove}
		 */
		public Builder remove(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.remove(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code rename}
		 */
		public Builder rename(@Nullable NodeInfoIngestInfo value) {
			this.rename = value;
			return this;
		}

		/**
		 * API name: {@code rename}
		 */
		public Builder rename(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.rename(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable NodeInfoIngestInfo value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.script(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code set}
		 */
		public Builder set(@Nullable NodeInfoIngestInfo value) {
			this.set = value;
			return this;
		}

		/**
		 * API name: {@code set}
		 */
		public Builder set(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.set(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable NodeInfoIngestInfo value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.sort(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code split}
		 */
		public Builder split(@Nullable NodeInfoIngestInfo value) {
			this.split = value;
			return this;
		}

		/**
		 * API name: {@code split}
		 */
		public Builder split(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.split(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code trim}
		 */
		public Builder trim(@Nullable NodeInfoIngestInfo value) {
			this.trim = value;
			return this;
		}

		/**
		 * API name: {@code trim}
		 */
		public Builder trim(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.trim(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code uppercase}
		 */
		public Builder uppercase(@Nullable NodeInfoIngestInfo value) {
			this.uppercase = value;
			return this;
		}

		/**
		 * API name: {@code uppercase}
		 */
		public Builder uppercase(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.uppercase(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code urldecode}
		 */
		public Builder urldecode(@Nullable NodeInfoIngestInfo value) {
			this.urldecode = value;
			return this;
		}

		/**
		 * API name: {@code urldecode}
		 */
		public Builder urldecode(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.urldecode(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable NodeInfoIngestInfo value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.bytes(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code dissect}
		 */
		public Builder dissect(@Nullable NodeInfoIngestInfo value) {
			this.dissect = value;
			return this;
		}

		/**
		 * API name: {@code dissect}
		 */
		public Builder dissect(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.dissect(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code set_security_user}
		 */
		public Builder setSecurityUser(@Nullable NodeInfoIngestInfo value) {
			this.setSecurityUser = value;
			return this;
		}

		/**
		 * API name: {@code set_security_user}
		 */
		public Builder setSecurityUser(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.setSecurityUser(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(@Nullable NodeInfoIngestInfo value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.pipeline(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code drop}
		 */
		public Builder drop(@Nullable NodeInfoIngestInfo value) {
			this.drop = value;
			return this;
		}

		/**
		 * API name: {@code drop}
		 */
		public Builder drop(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.drop(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code circle}
		 */
		public Builder circle(@Nullable NodeInfoIngestInfo value) {
			this.circle = value;
			return this;
		}

		/**
		 * API name: {@code circle}
		 */
		public Builder circle(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.circle(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * API name: {@code inference}
		 */
		public Builder inference(@Nullable NodeInfoIngestInfo value) {
			this.inference = value;
			return this;
		}

		/**
		 * API name: {@code inference}
		 */
		public Builder inference(Function<NodeInfoIngestInfo.Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
			return this.inference(fn.apply(new NodeInfoIngestInfo.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoSettingsIngest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsIngest build() {

			return new NodeInfoSettingsIngest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsIngest}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsIngest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsIngest::setupNodeInfoSettingsIngestDeserializer, Builder::build);

	protected static void setupNodeInfoSettingsIngestDeserializer(
			DelegatingDeserializer<NodeInfoSettingsIngest.Builder> op) {

		op.add(Builder::attachment, NodeInfoIngestInfo._DESERIALIZER, "attachment");
		op.add(Builder::append, NodeInfoIngestInfo._DESERIALIZER, "append");
		op.add(Builder::csv, NodeInfoIngestInfo._DESERIALIZER, "csv");
		op.add(Builder::convert, NodeInfoIngestInfo._DESERIALIZER, "convert");
		op.add(Builder::date, NodeInfoIngestInfo._DESERIALIZER, "date");
		op.add(Builder::dateIndexName, NodeInfoIngestInfo._DESERIALIZER, "date_index_name");
		op.add(Builder::dotExpander, NodeInfoIngestInfo._DESERIALIZER, "dot_expander");
		op.add(Builder::enrich, NodeInfoIngestInfo._DESERIALIZER, "enrich");
		op.add(Builder::fail, NodeInfoIngestInfo._DESERIALIZER, "fail");
		op.add(Builder::foreach, NodeInfoIngestInfo._DESERIALIZER, "foreach");
		op.add(Builder::json, NodeInfoIngestInfo._DESERIALIZER, "json");
		op.add(Builder::userAgent, NodeInfoIngestInfo._DESERIALIZER, "user_agent");
		op.add(Builder::kv, NodeInfoIngestInfo._DESERIALIZER, "kv");
		op.add(Builder::geoip, NodeInfoIngestInfo._DESERIALIZER, "geoip");
		op.add(Builder::grok, NodeInfoIngestInfo._DESERIALIZER, "grok");
		op.add(Builder::gsub, NodeInfoIngestInfo._DESERIALIZER, "gsub");
		op.add(Builder::join, NodeInfoIngestInfo._DESERIALIZER, "join");
		op.add(Builder::lowercase, NodeInfoIngestInfo._DESERIALIZER, "lowercase");
		op.add(Builder::remove, NodeInfoIngestInfo._DESERIALIZER, "remove");
		op.add(Builder::rename, NodeInfoIngestInfo._DESERIALIZER, "rename");
		op.add(Builder::script, NodeInfoIngestInfo._DESERIALIZER, "script");
		op.add(Builder::set, NodeInfoIngestInfo._DESERIALIZER, "set");
		op.add(Builder::sort, NodeInfoIngestInfo._DESERIALIZER, "sort");
		op.add(Builder::split, NodeInfoIngestInfo._DESERIALIZER, "split");
		op.add(Builder::trim, NodeInfoIngestInfo._DESERIALIZER, "trim");
		op.add(Builder::uppercase, NodeInfoIngestInfo._DESERIALIZER, "uppercase");
		op.add(Builder::urldecode, NodeInfoIngestInfo._DESERIALIZER, "urldecode");
		op.add(Builder::bytes, NodeInfoIngestInfo._DESERIALIZER, "bytes");
		op.add(Builder::dissect, NodeInfoIngestInfo._DESERIALIZER, "dissect");
		op.add(Builder::setSecurityUser, NodeInfoIngestInfo._DESERIALIZER, "set_security_user");
		op.add(Builder::pipeline, NodeInfoIngestInfo._DESERIALIZER, "pipeline");
		op.add(Builder::drop, NodeInfoIngestInfo._DESERIALIZER, "drop");
		op.add(Builder::circle, NodeInfoIngestInfo._DESERIALIZER, "circle");
		op.add(Builder::inference, NodeInfoIngestInfo._DESERIALIZER, "inference");

	}

}
